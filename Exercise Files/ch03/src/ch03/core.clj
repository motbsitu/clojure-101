(ns ch03.core)

(defn function-argument-example [x]
  (println (* 2 x))
  (println (+ (* 2 x) 1))
  (println (/ (+ (* 2 x) 1) 2)))

  8
  9
  9/2
  nil



(quot 5 2)
(rem 5 2)
(double (/ 5 2))

user=> (quot 5 2)
2
user=> (rem 5 2)
1
user=> (double (/ 5 2))
2.5
user=>


(defn let-binding-example [x]
  (let [x2 (* 2 x)
        x2+1 (+ x2 1)
        x2+1over2 (/ x2+1 2)]
    (println x2)
    (println x2+1)
    (println x2+1over2)))

    8
    9
    9/2

(re-find #"ca+t" "a caaaat and a dog")
"caaaat"


Symbols

(def a 42)
('a {'a 24, 'b 42})
(:a {:a 24, :b 42})
