(ns levenshtein.core)

(defn abs [x] (if (> x 0) x (- x)))

(defn distance [x y] 
  (if (= 0 (.length x)) 
    (.length y)
    (if (= 0 (.length y))
      (.length x)
      (abs (- (.length x) (.length y)))  
    )
  )
)
