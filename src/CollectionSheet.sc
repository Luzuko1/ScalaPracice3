val nums =Array(6,5,8,7,2,5)
val p = Array[String]("John","Mark","Dave")


case class People(firstName:String, age:Int)

//val people = Array[Int](1,2,3,4)
// only take integers
val person = People("John", 18)
val people = Array(person)

val peopleList = List(People("Jack", 53))

val randoms = List.fill(100)(math.random())

//val peoplefill = List.fill(People)()
1::2::3::Nil


val newPerson = peopleList :: person :: Nil
val newPerson2 = newPerson :: 5 ::6 ::Nil

println(peopleList)


val nums2 = Array(6,8,3,4,1,7)
val words = List("Scala","is","fun","to","code","in")

nums2.drop(3)
nums2.dropRight(2)
nums2.head
nums2.tail
nums2.last

nums2.slice(2,5)
words.splitAt(3)

nums2.take(4)
nums2.takeRight(4)

nums2.diff(List(4,5,6,7))

List(1,2,3,1,6,5,2,1).distinct
nums2.intersect(List(4,5,6,7))

nums2.union(List(4,5,6,7))

nums2.sorted
words.sorted

nums2.max
nums2.min
nums2.product
nums2.sum

nums2.foreach(println)

words.foreach(println)


nums2.foreach(n => println(2*n))

nums2.map(n => n*2)

nums2.map(_*2)

//nums2.map(_.length)
nums2.filter(_<5)

nums2.filter(_% 2 ==0)

nums2.foldLeft(0)(_ +_)
nums2.foldLeft(1)(_*_)
words.foldLeft(0)(_+_ .length)
