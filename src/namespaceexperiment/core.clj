(ns namespaceexperiment.core)

;; other stuff here

(do 
  (ns namespaceexperiment.data)

  (defrecord Data [x y])

  (ns namespaceexperiment.core
    (:require [namespaceexperiment.data :as d]))
  ;(:import [namespaceexperiment.data Data]))

  ;(require [namespaceexperiment.data :as d])
  (import [namespaceexperiment.data Data])

  (defrecord Foo [x])

  (defn baz [x y] (d/->Data x y))
  (def bazdata (baz 5 7))
  (println bazdata)

  ;(defn bar [x y] (namespaceexperiment.data/Data. x y))
  (defn bar [x y] (d/Data. x y))
  (def bardata (bar 5 9))
  (println bardata)

  (defn foo [x] (Foo. x))
  (println (foo 22))

  (defn fooz [x] (->Foo x))
  (println (fooz 42))
)
