// In-class exercise

// Write lambda functions:

(define identity
    (lambda (x)
        x
    )
)

(define add5
    (lambda (x)
        (+ x 5)
    )
)

(define dimension
    (lambda (x y z)
        (* x y z)
    )
)

(define sq
    (lambda (x)
        (* x x)
    )
)

(define cube1
    (lambda (x)
        (* x x x)
    )
)

(define cube2
    (lambda (x)
        (* x (sq x))
    )
)

(define gt5
    (lambda (x)
        (if (> x 5) #t #f)
    )
)

(define sum
    (lambda (n)
        (if (= n 1) 1
            (+ n (sum (- n 1)))
        )
    )
)

// correct implementation
(define sumsquares1
    (lambda (n m)
        (if (= n m) (* m m)
            (+ (* m m) (sumsquares1 n (- m 1)))
        )
    )
)

// incorrect alternative
(define sumsquares2
    (lambda (n m)
        (if (= n m) 1
            (+ (* m m) (sumsquares2 n (- m 1)))
        )
    )
)

// correct alternative
(define sumsquares3
    (lambda (n m)
        (if (= n m) (* m m)
            (+ (* n n) (sumsquares3 (+ n 1) m))
        )
    )
)

(define filter
    (lambda (op l)
        (if (null? l) (list)
            (if (op (car l)) (cons (car l) (filter op (cdr l)))
                (filter op (cdr l))
            )
        )
    )
)







