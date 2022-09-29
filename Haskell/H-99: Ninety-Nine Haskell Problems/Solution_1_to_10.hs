--Question-1 ->	Finding the last element from the list

last_elem :: [a] -> a
last_elem [] = error "empty lists"
last_elem [x] = x
last_elem (x:xs) = last_elem xs


--Question-2 ->	Finding the last but one element from the list

myButLast :: [a] -> a
myButLast [] = error "empty lists"
myButLast [x] = error "one element"
myButLast (x:xs) = 
				if length xs == 1
				then x
				else myButLast xs

				
--Question-3 ->	Finding the kth element from the list
				
elementAt' :: [a] -> Int -> a
elementAt' (x:_) 1  = x
elementAt' [] _     = error "Index out of bounds"
elementAt' (_:xs) k
  | k < 1           = error "Index out of bounds"
  | otherwise       = elementAt' xs (k - 1)
  

--Question-4 ->	Finding the length of the list

myLength' :: [a] -> Int
myLength' [] = 0
myLength' (_:xs) = 1 + myLength'(xs)


--Question-5 ->	Reverse a list

myReverse :: [a] -> [a]
myReverse [] = error "empty list"
myReverse [x] = [x]
myReverse (x:xs) = myReverse xs ++ [x]

