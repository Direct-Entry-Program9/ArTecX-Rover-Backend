CREATE TABLE User(
                     username VARCHAR(20) PRIMARY KEY ,
                     currentX INT NOT NULL ,
                     currentY INT NOT NULL ,
                     previousCommand VARCHAR(20) NOT NULL,
                     timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
);