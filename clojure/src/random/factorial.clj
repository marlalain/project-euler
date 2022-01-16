(ns random.factorial)

(defn naive_factorial [number]
	(if (= number 1)
		number
		(* number (naive_factorial (- number 1)))))

(defn factorial-helper [acc n]
	(if (= 1 acc) n (factorial-helper (- acc 1) (* acc n))))

(defn factorial [number]
	(factorial-helper number 1))

(println (time (naive_factorial 4)))
(println (time (factorial 8)))
