;; yikebocai's solution to Drop Every Nth Item
;; https://4clojure.com/problem/41

(fn [x y]
  (loop [s [] i 0]
    (if (< i (count x))
      (recur 
       (conj s (nth x i)) 
       (if (= (mod  (+ 2 i) y) 0) 
         (+ i 2) 
         (inc i)))
      s)))

;;beautiful solution
(fn [x y]
   (map last #(filter (not= 0 (mod (first %1) y)))
       (map-indexed #(list (+ 1 %1) %2) x)))
