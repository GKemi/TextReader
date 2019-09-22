package com.example.gilhakemi.textreader

import java.io.File
import java.io.InputStream

/**
 * Created by work on 22/09/2019.
 */
 interface TextPort {
  fun openFile(name: String): InputStream
 }