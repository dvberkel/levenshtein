(ns levenshtein.core)

(defn abs [x] (if (> x 0) x (- x)))

(defn distance [x y] 
  (if (= 0 (.length x)) 
    (.length y)
    (if (= 0 (.length y))
      (.length x)
      (if (= (get x 0) (get y 0))
        (distance (subs x 1) (subs y 1))
	(2)  
      )
    )
  )
)
