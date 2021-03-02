package com.katilijiwo.edcmachineandroidprintpractice.util

import com.google.gson.Gson
import com.google.gson.GsonBuilder

import com.katilijiwo.edcmachineandroidprintpractice.model.ProductDatabase
import java.text.NumberFormat
import java.util.*


class Util {

    companion object {
        const val SUCCESS_CODE = 200
        const val FAILED_CODE = 205
        const val PACKAGE_NAME = "id.co.pcsindonesia.ia.dcm"
        const val CLASS_NAME = "id.co.pcsindonesia.ia.dcm.activity.PaymentActivity"
        const val CLASS_NAME_P = "id.co.pcsindonesia.ia.dcm.activity.DetailVoidActivity"
        const val KEY = "PCS23D1712"
        const val KEY_P = "PCS23V1712"
        const val REQ_TO_HOME = 100
        const val IMAGE_CAPTURE_CODE = 200
        const val PERMISSION_CODE = 1001
        const val VOID = "request_void"


        const val POS_PACKAGE_NAME = "id.co.pcsindonesia.ia.pos"
        const val POS_CLASS_NAME = "id.co.pcsindonesia.ia.pos.activity.cart.CartActivity"
        const val POS_CLASS_NAME_P = "id.co.pcsindonesia.ia.pos.activity.penjualan.PenjualanActivity"
        const val KEY_OF_PAID = "00"
        const val DEVICE_SUNMI_P1 = "P1_4G-EU"
        const val DEVICE_SUNMI_BRI = "P1_4G-BRI"

        const val HEADER_TOKEN = "Authorizations"
        const val HEADER_ID = "User-ID"
        const val CONTENT_URI = "content://id.co.pcsindonesia.ia.dcm.util.DecoProvider/profile/#910"

        //AES ENCRYPTION
        const val APP_KEY = "I43HEJSRTX9k54p4"
        const val APP_SALT = "k8hsjkud8302nfi23r"
        const val APP_KEY_FAC = "PBKDF2WithHmacSHA1"
        const val APP_KEY_MODE = "AES/CBC/PKCS5Padding"
        const val APP_ENC = "AES"
        const val APP_ITR = 2
        const val APP_LENGTH = 256
        //Function Helper

        fun tagBuilder(tag: String?): String {
            val replace = tag!!.trim().substring(0, tag.length - 1)
            val data = replace.trim().split(",").toTypedArray()
            val gson = Gson()
            val gsonPretty = GsonBuilder().setPrettyPrinting().create()
            val jsonTutsList: String = gson.toJson(data)
            return jsonTutsList
        }

        fun jsonTrx(trx: List<ProductDatabase?>): String {
            val gson = Gson()
            val gsonPretty = GsonBuilder().setPrettyPrinting().create()
            val jsonTutsList: String = gson.toJson(trx)
//            val jsonTutPretty: String = gsonPretty.toJson(trx)
            return jsonTutsList.toString()
        }

        fun parseItem(item: List<ProductDatabase?>): String {
            var text = ""
            for (items in item) {
                text += "${items?.qty}x${items?.productName}, "
            }
            return text
        }

        fun numberCur(data: String?): String {
            val locale = Locale("in", "ID")
            val numberFormat: NumberFormat = NumberFormat.getNumberInstance()
            return numberFormat.format(data?.toDouble())
        }

        fun rowItemPrint(qty: String?, price: String?, total: String?): String {
            var space1 = " ".repeat(11 - qty!!.length)
            var space2 = " ".repeat(11 - price!!.length)

            return "$qty x$space1@${numberCur(price)}$space2${numberCur(total)}\n"
        }

    }
}