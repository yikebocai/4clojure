;; yikebocai's solution to Cartesian Product
;; https://4clojure.com/problem/90

(fn [x y] 
  (loop [s #{} i 0] 
    (if (< i (count y)) 
      (recur 
       (into s 
             (map #(conj [] %1 %2) 
                  x 
                  (repeat 
                   (count x) 
                   (nth (into [] y) i)))) 
       (inc i))
      s)))
