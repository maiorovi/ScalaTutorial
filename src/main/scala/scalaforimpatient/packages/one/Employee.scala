package scalaforimpatient {
package packages {
package one {

class Employee {

}

}

}
}

/*
There is no enforced relationship between the directory of the source file and the package.
 You don’t have to put Employee.scala and Manager.scala into a com/horstmann/impatient directory.


Conversely, you can contribute to more than one package in a single file. The file Employee.scala can contain
package com {
package horstmann {
package impatient {
class Employee
...
}
}
}

package org {
package bigjava {
class Counter
...
}
}

*/