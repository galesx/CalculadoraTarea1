package com.example.calculadoratarea1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import com.example.calculadoratarea1.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity(), OnClickListener {

    //fichero
    private lateinit var binding: ActivityMainBinding
    var operando1: Double = 0.0
    var operando2: Double = 0.0
    var resultado:Double = 0.0
    var operacion: Int =0
    var operando:Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textoPrincipal.text = savedInstanceState?.getString("textoPrincipal") ?: "0"


        resultado = savedInstanceState?.getDouble("textoResultado") ?: 0.0
        binding.textoResultado.text = resultado.toString()

        binding.btn0.setOnClickListener(this)
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)
        binding.btnDividir.setOnClickListener(this)
        binding.btnIgual.setOnClickListener(this)
        binding.btnLimpiar.setOnClickListener(this)
        binding.btnMultiplicar.setOnClickListener(this)
        binding.btnRestar.setOnClickListener(this)
        binding.btnSuma.setOnClickListener(this)
        binding.btnPunto.setOnClickListener(this)
        binding.btnModulo?.setOnClickListener(this)
        binding.btnPotencia?.setOnClickListener(this)
        binding.btnRaiz?.setOnClickListener(this)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textoPrincipal",binding.textoPrincipal.text.toString())
        outState.putDouble("textoResultado",resultado)
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            binding.btnPunto.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }

            }
            binding.btn0.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }

            }
            binding.btn1.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn2.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn3.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn4.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn5.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn6.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn7.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn8.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btn9.id->{
                if (!operando){
                    binding.textoPrincipal.append((v as Button).text)
                }else{
                    binding.textoPrincipal.text = ((v as Button).text)
                    operando = false
                }            }
            binding.btnLimpiar.id->{
                binding.textoPrincipal.text = "0"
                binding.textoResultado.text = ""
                operando = true
            }
            binding.btnSuma.id->{
                operando1 = binding.textoPrincipal.text.toString().toDouble()
                binding.textoPrincipal.append("+")
                operacion = 0;
                operando = true
            }
            binding.btnRestar.id->{
                operando1 = binding.textoPrincipal.text.toString().toDouble()
                binding.textoPrincipal.append("-")
                operacion = 1;
                operando = true
            }
            binding.btnDividir.id->{
                operando1 = binding.textoPrincipal.text.toString().toDouble()
                binding.textoPrincipal.append("/")
                operacion = 2;
                operando = true
            }
            binding.btnMultiplicar.id->{
                operando1 = binding.textoPrincipal.text.toString().toDouble()
                binding.textoPrincipal.append("*")
                operacion = 3;
                operando = true
            }
            binding.btnModulo?.id->{
                operando1 = binding.textoPrincipal.text.toString().toDouble()
                binding.textoPrincipal.append("%")
                operacion = 4;
                operando = true
            }
            binding.btnPotencia?.id->{
                operando1 = binding.textoPrincipal.text.toString().toDouble()
                binding.textoPrincipal.append("^")
                operacion = 5;
                operando = true
            }
            binding.btnRaiz?.id->{
                operando1 = binding.textoPrincipal.text.toString().toDouble()
                operacion = 6;
                operando = true
            }
            binding.btnIgual.id->{
                operando2 = binding.textoPrincipal.text.toString().toDouble()

                when(operacion){
                    0->{
                        resultado = operando1+operando2
                        binding.textoPrincipal.text = operando1.toString()+binding.btnSuma.text+operando2.toString()
                    }
                    1->{
                        resultado = operando1-operando2
                        binding.textoPrincipal.text = operando1.toString()+binding.btnRestar.text+operando2.toString()
                    }
                    2->{
                        resultado = operando1/operando2
                        binding.textoPrincipal.text = operando1.toString()+binding.btnDividir.text+operando2.toString()
                    }
                    3->{
                        resultado = operando1*operando2
                        binding.textoPrincipal.text = operando1.toString()+binding.btnMultiplicar.text+operando2.toString()
                    }
                    4->{
                        resultado = operando1%operando2
                        binding.textoPrincipal.text = operando1.toString()+binding.btnModulo?.text+operando2.toString()
                    }
                    5->{
                        resultado = operando1.pow(operando2)
                        binding.textoPrincipal.text = operando1.toString()+binding.btnPotencia?.text+operando2.toString()
                    }
                    6->{
                        resultado = sqrt(operando1)
                    }
                }
                binding.textoResultado.text = resultado.toString()
                operando = true
            }


        }


    }
}