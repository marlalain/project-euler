(ns project-euler-clojure.003)

(def number 13185)

(defn is-multiple-of-number?
  [i]
  (when (= 0 (mod number i)) i))

(defn is-prime? [number i]
  (when (< 1 number)
    (when (is-multiple-of-number? number i))))

; (println (filter is-multiple-of-number? (range (- number 1) 1 -1)))

(println (is-prime? 2))