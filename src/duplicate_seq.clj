;; yikebocai's solution to Duplicate a Sequence
;; https://4clojure.com/problem/32

(fn [s] 
  (let [sq (map #(take 2 (repeat %)) s)]
    (reduce concat sq)))
