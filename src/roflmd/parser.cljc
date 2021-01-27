(ns roflmd.parser
  (:require [instaparse.core :as insta]))

(def p
  (insta/parser
    (clojure.java.io/resource "roflmd-grammar.ebnf")))

(println "OUT" (p "**bold**"))
