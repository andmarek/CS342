/* Problem 1 a */

(define Search
    (lambda (num lst)
        (if (null? lst) #f
            (if (= (car lst) num) #t
                (Search (cdr lst) num)))))

(define Find
    (lambda (num  lst)
        (if (null? lst) lst
            (if (Search car lst) num) (cons (car lst) (Find num (cdr lst)))
                (Find num (cdr lst)))))

/* Problem 1 b */

(define flatten
    (lambda (lst)
        (if (null? lst) lst
            (if (checkIsList (car lst)) (append (flatten (car lst)) (flatten (cdr lst)))
                (append (list (car lst)) (flatten (cdr lst)))))))

/* Problem 2 */
(define forloop
    (lambda (counter condition increment)
        (lambda (body)
            (if (condition count) (if (condition (increment count)) ((forloop (increment count)
            condition increment) body) (body count)) -1))))

