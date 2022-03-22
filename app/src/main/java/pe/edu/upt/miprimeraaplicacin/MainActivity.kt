package pe.edu.upt.miprimeraaplicacin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Log.d("SMI",getString(R.string.created))

    val btnAcercaDe = findViewById<Button>(R.id.id_acerca)
    btnAcercaDe.setOnClickListener(this)
  }

  override fun onClick(p0: View?) {
    when(p0?.id){
      R.id.id_acerca->{
        val intent = Intent(this, AcercaDe::class.java)
        startActivity(intent)
      }
    }
  }

  override fun onStart() {
    super.onStart()
    Log.d("SMI",getString(R.string.started))
  }

  override fun onResume() {
    super.onResume()
    Log.d("SMI",getString(R.string.resumed))
  }

  override fun onPause() {
    super.onPause()
    Log.d("SMI",getString(R.string.paused))
  }

  override fun onStop() {
    super.onStop()
    Log.d("SMI",getString(R.string.stopped))
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d("SMI",getString(R.string.destroyed))
  }

  override fun onRestart() {
    super.onRestart()
    Log.d("SMI",getString(R.string.restarted))
  }



}