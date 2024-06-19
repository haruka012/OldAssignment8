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
      ```curl  
      curl--location 'localhost:8080/animals'
      ```

## 指定したIDの動物を取得するAPI

* リクエスト
    * Method:GET
    * URL: /animals/{id}
* レスポンス
    * StatusCode: 200
    * Body: 指定したIDの動物をJSON形式で返す
    * IDが存在しない場合はステータスコード404を返す
      ```curl
      curl--location 'localhost:8080/animals/1'
      ```
    * 200の場合のレスポンス
      ```json
      {
      "id": 1,
      "name": "モモ",
      "type": "カバ",
      "classification": "哺乳類",
      "sex": "2"
      }
      ```
    * 404の場合のレスポンス
      ```json
      {
      "message": "animal not found",
      "timestamp": "2024-06-20T06:07:01.528696700+09:00[Asia/Tokyo]",
      "error": "Not Found",
      "path": "/animals/100",
      "status": "404"
      }
      ```
