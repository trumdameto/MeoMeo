﻿GO
USE master
GO
--DROP DATABASE MEOMEO
GO
CREATE DATABASE MEOMEO
GO
USE MEOMEO

GO
CREATE TABLE HANG
(
     ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    [NAME] NVARCHAR(80)
);

GO
CREATE TABLE KIEUDANG
(
     ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    [NAME] NVARCHAR(80)
);

GO
CREATE TABLE DANHMUC
(
 ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
 [NAME] NVARCHAR(80)
);

GO
CREATE TABLE MAUSAC
(
    ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    [NAME] NVARCHAR(80)
);

GO
CREATE TABLE KICHCO
(
    ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    SIZE INT
);

GO
CREATE TABLE GIAY
(
     ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
     MA_GIAY VARCHAR(20) not null,
     [NAME] NVARCHAR(80)
);

GO
CREATE TABLE GIAYCHITIET
(
    ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    ID_GIAY UNIQUEIDENTIFIER,
    ID_HANG UNIQUEIDENTIFIER,
    ID_KIEUDANG UNIQUEIDENTIFIER,
    ID_DANHMUC UNIQUEIDENTIFIER,
    ID_MAUSAC UNIQUEIDENTIFIER,
    ID_KICHCO UNIQUEIDENTIFIER,
    GIA DECIMAL(10, 2) not null,
    SOLUONG INT not null,
    TRANGTHAI NVARCHAR(50),
    MOTA NVARCHAR(225),
);

GO
CREATE TABLE HOADONCHITIET
(
    ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    ID_GIAYCT UNIQUEIDENTIFIER,
    ID_HOADON UNIQUEIDENTIFIER,
    GIA DECIMAL(10, 2) not null,
    SOLUONG INT not null,
    TRANGTHAI NVARCHAR(50),
);

GO
CREATE TABLE KHACHHANG
(
     ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    TEN NVARCHAR(50) not null,
    GIOITINH BIT not null,
    SDT VARCHAR(12) not null,
    DIACHI NVARCHAR(225)
);

GO
CREATE TABLE THANHTOAN
(
    ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    MATHANHTOAN VARCHAR(50) not null,
    [TYPE] BIT not null,
    [NAME] VARCHAR(20),
    [VALUE] DECIMAL(10, 2) not null,
    ID_HOADON INT,
);

GO
CREATE TABLE HOADON
(
    ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    ID_VOUCHER UNIQUEIDENTIFIER,
    ID_NHANVIEN UNIQUEIDENTIFIER,
    ID_KHACHHANG UNIQUEIDENTIFIER,
    MAHOADON VARCHAR(50) not null,
    NGAYBAN DATE not null,
    SDT VARCHAR(12),
    DIACHI NVARCHAR(225),
    PHISHIP DECIMAL(10, 2),
    TONGTIEN DECIMAL(10, 2) not null,
    TRANGTHAI NVARCHAR(50) not null
);


GO
CREATE TABLE VOUCHER
(
     ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    [NAME] NVARCHAR(50) not null,
    MAGIAMGIA VARCHAR(12) not null,
    DIEUKIEN DECIMAL(10, 2) not null,
    SOLUONG INT not null,
    NGAYBD DATE not null,
    NGAYKT DATE not null,
    LOAI BIT
);

GO
-- Tạo bảng NHANVIEN
CREATE TABLE NHANVIEN
(
    ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
    TEN NVARCHAR(50) NOT NULL,
    GIOITINH BIT NOT NULL,
    SDT VARCHAR(12) NOT NULL,
    DIACHI NVARCHAR(225) NOT NULL,
    NGAYSINH DATE NOT NULL,
    MATKHAU VARCHAR(20) NOT NULL,
    VAITRO NVARCHAR(20) NOT NULL,
    TRANGTHAI NVARCHAR(50)
);

-- Thêm dữ liệu mẫu vào bảng NHANVIEN
INSERT INTO NHANVIEN (TEN, GIOITINH, SDT, DIACHI, NGAYSINH, MATKHAU, VAITRO, TRANGTHAI) VALUES 
(N'Nguyễn Văn Quang', 0, '0876546678', N'Hà Nam', CAST('1999-08-01' AS Date), '12345', N'Nhân Viên', N'Magic man'),
(N'Adminstrator', 0, '0123456789', N'Admin', CAST('2004-10-27' AS Date), 'admin', N'Admin', N'Superman');

GO
ALTER TABLE GIAYCHITIET ADD CONSTRAINT FK_CHITIET_GIAY FOREIGN KEY (ID_GIAY) REFERENCES GIAY(ID)

ALTER TABLE GIAYCHITIET ADD CONSTRAINT FK_CHITIET_HANG FOREIGN KEY (ID_HANG) REFERENCES HANG(ID)

ALTER TABLE GIAYCHITIET ADD CONSTRAINT FK_CHITIET_KIEUDANG FOREIGN KEY (ID_KIEUDANG) REFERENCES KIEUDANG(ID)

ALTER TABLE GIAYCHITIET ADD CONSTRAINT FK_CHITIET_DANHMUC FOREIGN KEY (ID_DANHMUC) REFERENCES DANHMUC(ID)

ALTER TABLE GIAYCHITIET ADD CONSTRAINT FK_CHITIET_MAUSAC FOREIGN KEY (ID_MAUSAC) REFERENCES MAUSAC(ID)

ALTER TABLE GIAYCHITIET ADD CONSTRAINT FK_CHITIET_KICHCO FOREIGN KEY (ID_KICHCO) REFERENCES KICHCO(ID)

GO
ALTER TABLE HOADONCHITIET ADD CONSTRAINT FK_HDCHITIET_GIAYCT FOREIGN KEY (ID_GIAYCT) REFERENCES GIAYCHITIET(ID) ON UPDATE CASCADE

ALTER TABLE HOADONCHITIET ADD CONSTRAINT FK_HDCHITIET_HOADON FOREIGN KEY (ID_HOADON) REFERENCES HOADON(ID) ON UPDATE CASCADE
ON DELETE CASCADE

GO
ALTER TABLE HOADON ADD CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (ID_KHACHHANG) REFERENCES KHACHHANG(ID) ON UPDATE CASCADE

ALTER TABLE HOADON ADD CONSTRAINT FK_HOADON_VOUCHER FOREIGN KEY (ID_VOUCHER) REFERENCES VOUCHER(ID)

ALTER TABLE HOADON ADD CONSTRAINT FK_HOADON_NHANVIEN FOREIGN KEY (ID_NHANVIEN) REFERENCES NHANVIEN(ID) ON UPDATE CASCADE

-- Chèn dữ liệu vào bảng HANG
INSERT INTO HANG ([NAME]) VALUES ('Hãng A');
INSERT INTO HANG ([NAME]) VALUES ('Hãng B');

-- Chèn dữ liệu vào bảng KIEUDANG
INSERT INTO KIEUDANG ([NAME]) VALUES ('Kiểu 1');
INSERT INTO KIEUDANG ([NAME]) VALUES ('Kiểu 2');

-- Chèn dữ liệu vào bảng DANHMUC
INSERT INTO DANHMUC ([NAME]) VALUES ('Danh mục 1');
INSERT INTO DANHMUC ([NAME]) VALUES ('Danh mục 2');

-- Chèn dữ liệu vào bảng MAUSAC
INSERT INTO MAUSAC ([NAME]) VALUES ('Màu 1');
INSERT INTO MAUSAC ([NAME]) VALUES ('Màu 2');

-- Chèn dữ liệu vào bảng KICHCO
INSERT INTO KICHCO (SIZE) VALUES (38);
INSERT INTO KICHCO (SIZE) VALUES (39);

-- Chèn dữ liệu vào bảng GIAY
INSERT INTO GIAY (MA_GIAY, [NAME]) VALUES ('G001', 'Giày A');
INSERT INTO GIAY (MA_GIAY, [NAME]) VALUES ('G002', 'Giày B');



sELECT * FROM HANG
sELECT * FROM KIEUDANG
sELECT * FROM DANHMUC
sELECT * FROM MAUSAC
sELECT * FROM KICHCO
sELECT * FROM GIAY
sELECT * FROM GIAYCHITIET
sELECT * FROM HOADONCHITIET
sELECT * FROM KHACHHANG
sELECT * FROM THANHTOAN
sELECT * FROM HOADON
sELECT * FROM VOUCHER
sELECT * FROM NHANVIEN

