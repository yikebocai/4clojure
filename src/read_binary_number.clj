;; yikebocai's solution to Read a binary number
;; https://4clojure.com/problem/122

(fn [x]  
  (apply 
   + 
   (map-indexed 
    #(* 
      (int (java.lang.Math/pow 2 (- (count x) (+ 1 %))))  
      (read-string (str %2))) 
    x)))
