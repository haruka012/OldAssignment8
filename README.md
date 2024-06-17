# このプロジェクトについて

このプロジェクトでは、Spring BootとMysqlを用いた簡単なCRUD処理をもつRESTfulなWeb APIを実装します。

# 開発環境

* Java 17
* Spring Boot 3.2.5
* MySQL 3.8

# APIの概要

動物園の動物のデータ（ID、名前、種類、分類、性別［1：オス、2：メス］）を管理することを前提として作成してみました。

## 動物を全件取得するAPI
* リクエスト
  * Method: GET
  * URL: /animals
* レスポンス
  * StatusCode: 200
  * Body: 動物のリストをJSON形式で返す   
`curl --location 'localhost:8080/animals'`

## 指定したIDの動物を取得するAPI
* リクエスト
  * Method:　GET
  * URL: /animals/{id}
* レスポンス
  * StatusCode: 200
  * Body: 指定したIDの動物をJSON形式で返す 
  * IDが存在しない場合はステータスコード404を返す  
``
* 200の場合のレスポンス  
``
* 404の場合のレスポンス  
``

  

