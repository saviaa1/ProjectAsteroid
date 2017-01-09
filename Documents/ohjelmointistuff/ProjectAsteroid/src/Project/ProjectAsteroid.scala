package Project

import scalafx.application.JFXApp
import scalafx.stage.WindowEvent
import scalafx.application.JFXApp.PrimaryStage
import scalafx.stage.Stage

object ProjectAsteroid extends JFXApp {
  //pistetään tänne kaikki muuttujat niin ei tarvitse sitten metsästää niitä myöhemmin.
  var isSoundOn: Boolean = true
  
  var GameArea: GameArea = _
  
  stage = new JFXApp.PrimaryStage {
    resizable = false
    centerOnScreen()
    title = "ProjectAsteroid"
    
    scene = Menu
    
  }
  //pitäisi saada niin että kun pääikkuna sulkeutuu niin koko ohjelma sammuu
  //ProjectAsteroid.stage.setOnCloseRequest(EventHandler<WindowEvent>() {
   // 
   // Platform.exit())
  //}
  //stage.fireEvent(new WindowEvent(stage, WindowEvent.WindowCloseRequest))
  
}

/*TODO:
 * jos avaa jonkun pop-up ikkunan ja sulkee pääikkunan niin ohjelma ei sulkeudu, fiksaa niin että sulkeutuu
 * Asteroidien läpinäkyvyys pois, tähdet näkyy läpi välillä
 * tyhjeneekö bufferit oikein kun tuhoutuu ja menee pois alueelta?
 * asteroidien sivuttais liike
 * highscore osio
 * seed arvo kun generoi asteroideja randomiksi, tulee ihan samalla tavalla aina nytten.
 */






