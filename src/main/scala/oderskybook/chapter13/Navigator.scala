package bobsrockets {
  package navigation {
  // in package bobsrockets.navigation
  class Navigator {
    // no need to say bobsrockets.navigation.StarMap
    val map = new StarMap
  }

    class StarMap

    package test {
      // in package bobsrockets.navigation.test
      class NavigatorSuite
    }

  }

  class Ship {
    // no need to say bobsrockets.navigation.Navigator
    val nav = new navigation.Navigator
  }

  package fleets {
    class Fleet {
      // no need to say bobsrockets.Ship
      def addShip() { new Ship}
    }
  }

}


/*
package bobsrockets {
  class Ship
}

package bobsrockets.fleets {
  class Fleet {
  // doesn`t compile! Ship is not in scope
    def addShip() {new Ship()}
  }
}
// symbols in enclosing package are not automaticly available
 */