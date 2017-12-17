# kuromoji-lambda

## 概要

iLab bot用のkuromojiによる形態素解析Lambda関数

## ビルドとLambda設定

### ビルド
```sh
gradle build
```

*** 以下にLambdaアップロード用のzipが作成される ***

```sh
<project-dir>/build/distributions/kuromoji-lambda.zip
```

### Lambda設定

1. Java8ランタイムのLambda関数を作成
2. 上記ビルド時に作成されたzipをアップロード
3. ハンドラとして"jp.co.nri_st.ilab.kuromoji_lambda.Handler::handleRequest"を設定

## 使用方法

*** 引数(event) ***

日本語のプレーンテキスト(String)

例："すもももももももものうち"

*** 戻り値 ***

```json
[
  {
    "surface": "すもも",
    "position": 0,
    "partOfSpeechLevel1": "名詞",
    "partOfSpeechLevel2": "一般",
    "partOfSpeechLevel3": "*",
    "partOfSpeechLevel4": "*",
    "conjugationType": "*",
    "conjugationForm": "*",
    "baseForm": "すもも",
    "reading": "スモモ",
    "pronunciation": "スモモ",
    "known": true,
    "user": false,
    "allFeatures": "名詞,一般,*,*,*,*,すもも,スモモ,スモモ",
    "allFeaturesArray": [
      "名詞",
      "一般",
      "*",
      "*",
      "*",
      "*",
      "すもも",
      "スモモ",
      "スモモ"
    ]
  },
  {
    "surface": "も",
    "position": 3,
    "partOfSpeechLevel1": "助詞",
    "partOfSpeechLevel2": "係助詞",
    "partOfSpeechLevel3": "*",
    "partOfSpeechLevel4": "*",
    "conjugationType": "*",
    "conjugationForm": "*",
    "baseForm": "も",
    "reading": "モ",
    "pronunciation": "モ",
    "known": true,
    "user": false,
    "allFeatures": "助詞,係助詞,*,*,*,*,も,モ,モ",
    "allFeaturesArray": [
      "助詞",
      "係助詞",
      "*",
      "*",
      "*",
      "*",
      "も",
      "モ",
      "モ"
    ]
  },
  {
    "surface": "もも",
    "position": 4,
    "partOfSpeechLevel1": "名詞",
    "partOfSpeechLevel2": "一般",
    "partOfSpeechLevel3": "*",
    "partOfSpeechLevel4": "*",
    "conjugationType": "*",
    "conjugationForm": "*",
    "baseForm": "もも",
    "reading": "モモ",
    "pronunciation": "モモ",
    "known": true,
    "user": false,
    "allFeatures": "名詞,一般,*,*,*,*,もも,モモ,モモ",
    "allFeaturesArray": [
      "名詞",
      "一般",
      "*",
      "*",
      "*",
      "*",
      "もも",
      "モモ",
      "モモ"
    ]
  },
  {
    "surface": "も",
    "position": 6,
    "partOfSpeechLevel1": "助詞",
    "partOfSpeechLevel2": "係助詞",
    "partOfSpeechLevel3": "*",
    "partOfSpeechLevel4": "*",
    "conjugationType": "*",
    "conjugationForm": "*",
    "baseForm": "も",
    "reading": "モ",
    "pronunciation": "モ",
    "known": true,
    "user": false,
    "allFeatures": "助詞,係助詞,*,*,*,*,も,モ,モ",
    "allFeaturesArray": [
      "助詞",
      "係助詞",
      "*",
      "*",
      "*",
      "*",
      "も",
      "モ",
      "モ"
    ]
  },
  {
    "surface": "もも",
    "position": 7,
    "partOfSpeechLevel1": "名詞",
    "partOfSpeechLevel2": "一般",
    "partOfSpeechLevel3": "*",
    "partOfSpeechLevel4": "*",
    "conjugationType": "*",
    "conjugationForm": "*",
    "baseForm": "もも",
    "reading": "モモ",
    "pronunciation": "モモ",
    "known": true,
    "user": false,
    "allFeatures": "名詞,一般,*,*,*,*,もも,モモ,モモ",
    "allFeaturesArray": [
      "名詞",
      "一般",
      "*",
      "*",
      "*",
      "*",
      "もも",
      "モモ",
      "モモ"
    ]
  },
  {
    "surface": "の",
    "position": 9,
    "partOfSpeechLevel1": "助詞",
    "partOfSpeechLevel2": "連体化",
    "partOfSpeechLevel3": "*",
    "partOfSpeechLevel4": "*",
    "conjugationType": "*",
    "conjugationForm": "*",
    "baseForm": "の",
    "reading": "ノ",
    "pronunciation": "ノ",
    "known": true,
    "user": false,
    "allFeatures": "助詞,連体化,*,*,*,*,の,ノ,ノ",
    "allFeaturesArray": [
      "助詞",
      "連体化",
      "*",
      "*",
      "*",
      "*",
      "の",
      "ノ",
      "ノ"
    ]
  },
  {
    "surface": "うち",
    "position": 10,
    "partOfSpeechLevel1": "名詞",
    "partOfSpeechLevel2": "非自立",
    "partOfSpeechLevel3": "副詞可能",
    "partOfSpeechLevel4": "*",
    "conjugationType": "*",
    "conjugationForm": "*",
    "baseForm": "うち",
    "reading": "ウチ",
    "pronunciation": "ウチ",
    "known": true,
    "user": false,
    "allFeatures": "名詞,非自立,副詞可能,*,*,*,うち,ウチ,ウチ",
    "allFeaturesArray": [
      "名詞",
      "非自立",
      "副詞可能",
      "*",
      "*",
      "*",
      "うち",
      "ウチ",
      "ウチ"
    ]
  }
]
```
