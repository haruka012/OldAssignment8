DROP TABLE IF EXISTS animals;
 CREATE TABLE animals (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  type VARCHAR(20) NOT NULL,
  classification VARCHAR(20) NOT NULL,
  sex CHAR(1) NOT NULL,
  PRIMARY KEY(id)
 );
 INSERT INTO animals (name,type,class,sex) VALUES ('モモ','カバ','哺乳類','2');
 INSERT INTO animals (name,type,class,sex) VALUES ('百吉','カバ','哺乳類','1');
 INSERT INTO animals (name,type,class,sex) VALUES ('デメタ','カバ','哺乳類','1');
 INSERT INTO animals (name,type,class,sex) VALUES ('だいちゃん','タイハクオウム','鳥類','1');
 INSERT INTO animals (name,type,class,sex) VALUES ('キャサリン','シバヤギ','哺乳類','1');
 INSERT INTO animals (name,type,class,sex) VALUES ('いのき','ポニー','哺乳類','1');
 INSERT INTO animals (name,type,class,sex) VALUES ('あかべえ','アカアシリクガメ','爬虫類','1');
