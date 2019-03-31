object Laptops extends App {

  case class Laptop(imeaNr:Long, name:String, model:String )
  case class Manufacture(name:String, address:String, laptop:Laptop, phoneNr:String)
  case class RAM(typ:String, speed:String, laptop:Laptop)
  case class HardDrive(size:String, manufacture:String, laptop:Laptop)

  val laptopOne = Laptop(1463315854,"Dell 825", "Seven Gen")
  val laptopTwo = Laptop(1242412544,"Lenovo ThinkPad", "fifth Gen")
  val laptopThree = Laptop(1253232624,"HP Compact", "Seven Gen")

  val manufacture= Manufacture("Dell","24 Wood Str", laptopOne, "088203662")
  val ram =RAM("DDR3", "4GB", laptopOne )
  val hardDrive =HardDrive("1TB","Toshiba",laptopOne )

  val manufacture2 =Manufacture("Lenovo", "104 Marvel Str", laptopTwo, "0821153452")
  val ram2 = RAM("DDR1","4GB",laptopTwo)
  val hardDrive2 = HardDrive("2TB", "Lenovo", laptopTwo)

  val manufacture3 = Manufacture("HP", "24 Voortrakker Str", laptopThree, "0845650122")
  val ram3 = RAM("i3", "4GB", laptopThree)
  val hardDrive3 = HardDrive("500GB", "HP",laptopThree)

  val components = List[Laptop](laptopOne,laptopTwo,laptopThree)
  println("Laptop One Info: \n"+laptopOne.name+"\n*****************"+
    "\n"+"-IMEA:"+laptopOne.imeaNr+
    "\n"+"-Brand:"+manufacture.name+
    "\n-RAM : "+ ram.typ, ram.speed+
    "\n"+ "-HardDrive: " +hardDrive.size, hardDrive.manufacture
    +"\n-Address: "+ manufacture.address+
    "\n-Generation: "+laptopOne.model+
    "\n" )

  println("Laptop Two Info: \n"+laptopTwo.name+"\n*****************"+
    "\n"+"-IMEA:"+laptopTwo.imeaNr+
    "\n"+"-Brand:"+manufacture2.name+
    "\n-RAM : "+ ram2.typ, ram2.speed+
    "\n"+ "-HardDrive: " +hardDrive2.size, hardDrive2.manufacture
    +"\n-Address: "+ manufacture2.address+
    "\n-Generation: "+laptopTwo.model+
    "\n" )

  println("Laptop Three Info: \n"+laptopThree.name+"\n****************"+
    "\n"+"-IMEA:"+laptopThree.imeaNr+
    "\n"+"-Brand:"+manufacture3.name+
    "\n-RAM : "+ ram3.typ, ram3.speed+
    "\n"+ "-HardDrive: " +hardDrive3.size, hardDrive3.manufacture
    +"\n-Address: "+ manufacture3.address+
    "\n-Generation: "+laptopThree.model+
    "\n" )
}
