(ns project-euler-clojure.001)

(defn is-multiple-of?
  [number multiple]
  (= 0 (mod number multiple)))

(defn is-multiple-of-3-or-5?
  [number]
  (or (is-multiple-of? number 3) (is-multiple-of? number 5)))

(println "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.\n")
(println "Multiples of 3 or 5:" (reduce + (filter is-multiple-of-3-or-5? (range 1000))))

