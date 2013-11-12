(ns gakuhatsu.core
  (:use [jayq.core :only [$]]))

(set! (. js/window -onload)
  #(.csv2table ($ "#csv_table") "list.csv"))
