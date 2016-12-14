(ns namespaceexperiment.core)

(defn foo [] "The Mighty Foo!")

(ns namespaceexperiment.data)

(defrecord Data [x y])

(ns namespaceexperiment.core
  (:require [namespaceexperiment.data :as d]))
  ;(:import [namespaceexperiment.data Data]))

;(require [namespaceexperiment.data :as d])
(import [namespaceexperiment.data Data])

(println (foo))

(defn baz [x y] (d/->Data x y))
(def bazdata (baz 5 7))
(println bazdata)

;(defn bar [x y] (namespaceexperiment.data/Data. x y))
(defn bar [x y] (d/Data. x y))
(def bardata (bar 5 7))
(println bardata)
