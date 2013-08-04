;; yikebocai's solution to Product Digits
;; https://4clojure.com/problem/99

(fn [x y] (map #(Integer/parseInt (str %))  (str (* x y))))

