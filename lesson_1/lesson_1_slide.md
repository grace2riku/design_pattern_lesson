---
marp: true
theme: gaia
size: 16:9
paginate: true
headingDivider: 2
header: 【連続講座1】デザインパターンを学び、ソフトウェア設計に生かそう
footer: 2024 @juraruming
style: |
---
# 【連続講座1】デザインパターンを学び、ソフトウェア設計に生かそう
Adapter・Factory Method・Singleton

パーソルクロステクノロジー株式会社
エンジニアリング事業管掌　設計統括本部
第2電子・制御設計本部　第1設計部　4G　阿部耕二

<!--
_class: lead
_paginate: false
_header: ""
footer: ""
-->

# 目次
- 自己紹介
- 良い設計とはどういう設計か?
- Adapter
- Factory Method
- Singleton
- 参考資料

<!--
_header: ""
_footer: "" 
-->

# 自己紹介
- 名前: 阿部　耕二（あべ　こうじ）
- 所属: パーソルクロステクノロジー株式会社
エンジニアリング事業管掌　設計統括本部
第2電子・制御設計本部　第1設計部　4G
- 医療機器の組込みソフトウェア開発。C言語。
- 趣味: 宇宙開発（[リーマンサットプロジェクト](https://www.rymansat.com/)広報メンバー）
- LAPRASポートフォリオ: https://lapras.com/public/k-abe
- Twitter: @juraruming

# 良い設計とはどういう設計か?
<!--
_footer: "" 
-->
良い設計のために個人的に大事だと思うキーワード

1. 凝集度
2. 結合度
3. 関心の分離

## 1. 凝集度
<!--
_footer: "" 
-->
* 関心ごとの集まり
* 凝集度が高い方（関心ごとが一箇所に集まっている）が良い設計と言われる

キッチンで料理を作る場面
キッチン周りには料理に必要な設備が配置される（水道、冷蔵庫、コンロ、食器棚、その他）。
→必要なものが凝集している状態

キッチン周りにTVや洗濯機はいらない。
料理をつくるという関心ごとにTVや洗濯機は不要。

## 2. 結合度
<!--
_footer: "" 
-->
* 他のモジュールとの関連の度合い
* 結合度が低い方（他のモジュールとの関連が少ない方）が良い設計と言われる


## 3. 関心の分離
<!--
_footer: "" 
-->
* 関心ごとを分離し、境界を設ける
* 関心の分離が表現されている例としてOSI参照モデル・TCP/IPに注目する

> 画像引用元
[OSI参照モデルとは？TCP/IPとの違いを図解で解説](https://www.itmanage.co.jp/column/osi-reference-model/)

---
<!--
_footer: "" 
-->

![bg width:1000px height:500px](img/OSI_reference_model.jpg)


---
<!--
_footer: "" 
-->

![bg width:1000px height:500px](img/OSI_reference_model_tcp.jpg)

---
<!--
_footer: "" 
-->

![bg width:1000px height:500px](img/OSI_reference_model_tcp_2.jpg)

# Adapter
<!--
_footer: "" 
-->

# Factory Method
<!--
_footer: "" 
-->


# Singleton


# 参考資料
<!--
_footer: "" 
-->
1. 
2. 
3. 


---

ご清聴ありがとうございました🙇