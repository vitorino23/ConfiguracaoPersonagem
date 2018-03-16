package com.example.logonrm.configuracaopersonagem

/**
 * Created by logonrm on 16/03/2018.
 */
enum class TipoPersonagemEnum(val id: Int){
    ANAO(0),
    ARQUEIRO(1),
    ASSASSINO(2),
    BARDO(3),
    CURANDEIRO(4),
    GUERREIRO(5),
    MAGO(6);

    companion object {
        fun from(findValue: Int): TipoPersonagemEnum = TipoPersonagemEnum.values().first { it.id == findValue}
    }
}


