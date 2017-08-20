def last(list: List[Int]) : Int = list.last
println(last(List(1, 1, 2, 3, 5, 8)))

def penultimate(list: List[Int]) : Int = list(list.length - 2)
println(penultimate(List(1, 1, 2, 3, 5, 8)))

def nth(x: Int, list: List[Int]) : Int = list(x)
println(nth(2, List(1, 1, 2, 3, 5, 8)))

def length(list: List[Int]) : Int = list.length
println(length(List(1, 1, 2, 3, 5, 8)))

def reverse(list: List[Int]) : List[Int] = list.reverse
println(reverse(List(1, 1, 2, 3, 5, 8)))

def isPalindrome(list: List[Int]) : Boolean = list == list.reverse
println(isPalindrome(List(1, 2, 3, 2, 1)))

def flatten(list: List[Any]) : List[Any] = list.flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

def compress(list: List[Any]) : List[Any] = //TODO
println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))