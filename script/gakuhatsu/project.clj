(defproject gakuhatsu "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "0.3.2"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [jayq "2.4.0"]]
  :cljsbuild {
    :builds [{
      ;ソースコードを配置するパス
      :source-paths ["src/gakuhatsu"]
      ;nodejsか標準を選択
      ;ClojureScriptコンパイラの基本オプション
      ;(ClojureScriptのドキュメントを良く見てね)
      :compiler {
        ;標準設定: target/cljsbuild-main.js
        :optimizations :advanced
        :externs ["jslib/jquery-1.9.js" "jslib/extern.js"]
        :pretty-print false}}]})
