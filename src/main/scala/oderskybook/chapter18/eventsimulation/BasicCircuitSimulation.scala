package oderskybook.chapter18.eventsimulation

import scala.actors.OutputChannel

abstract class BasicCircuitSimulation extends Simulation {

  def inverterDelay:Int
  def andGateDelay:Int
  def orGateDelay:Int

  class Wire {
    private var sigVal = false
    private var actions:List[Action] = List()

    def getSignal = sigVal
    def setSignal(s:Boolean):Unit = {
      if (s != sigVal) {
        sigVal = s
        actions.foreach(_())
      }
    }

    def addAction(a: Action) = {
      a :: actions
      a()
    }

    def inverter(input:Wire, output:Wire) = {
      def invertAction():Unit = {
        afterDelay(inverterDelay) {
          output setSignal !input.getSignal
        }
      }

      input addAction invertAction
    }

    def andGate(a1:Wire, a2:Wire, output:Wire) = {
      def andAction():Unit = {
        afterDelay(andGateDelay) {
          output setSignal (a1.getSignal & a2.getSignal)
        }
      }

      a1 addAction andAction
      a2 addAction andAction
    }

    def orGate(a1:Wire, a2:Wire, output:Wire) = {
      def orAction():Unit = {
        afterDelay(orGateDelay) {
          output setSignal (a1.getSignal | a2.getSignal)
        }
      }

      a1 addAction orAction
      a2 addAction orAction
    }

    def probe(name:String, wire:Wire) = {
      def probeAction():Unit = {
        println(name + " " + currentTime + " new-value = " + wire.getSignal )
      }

      wire addAction probeAction
    }

  }
}
