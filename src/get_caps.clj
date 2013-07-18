;; yikebocai's solution to Get the Caps
;; https://4clojure.com/problem/29

(fn [s] 
  (let [up (filter #(and (< (.hashCode  % ) 97) (> (.hashCode %) 64)) (seq s) )]
    (reduce str up)))
