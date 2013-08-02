;; yikebocai's solution to Set Intersection
;; https://4clojure.com/problem/81

(fn [x y] (set (filter #(contains? x %) y)))
