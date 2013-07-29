;; yikebocai's solution to Replicate a Sequence
;; https://4clojure.com/problem/33

(fn [x y]
   (loop [s [] i 0]
     (if (< i (count x))
       (recur
         (apply conj s (repeat y (nth x i)))
         (inc i))
       s)))
