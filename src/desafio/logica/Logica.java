package desafio.logica;

public class Logica {
    // a) 1, 3, 5, 7, _9_
    // b) 2, 4, 8, 16, 32, 64, _128_
    // c) 0, 1, 4, 9, 16, 25, 36, _49_
    // d) 4, 16, 36, 64, _100_
    // e) 1, 1, 2, 3, 5, 8, _13_
    // f) 2, 10, 12, 16, 17, 18, 19, _20_


    // Anotações
    // d 2^2, 4^2, 6^2, 8^2
    // c 1, 3, 5, 7, 9, 11, 13
    // f 8, 2, 4, 1, 1, 1, 1
}

// Interruptores: A, B, C
// Salas: 1, 2, 3
// 1. Ligar dois interruptores: A, B
// 2. Ir para a sala 1
//  2.1. Se a sala estiver com a luz desligada, significa que o interruptor C controla a luz da sala 1
//    2.1.1. Voltar para a sala dos interruptores, desligar apenas o interruptor A
//    2.1.2. Ir para a sala 2
//        2.1.2.1. Se a luz estiver acesa, significa que o interruptor B controla a luz da sala 2 e o interruptor A controla a luz da sala 3
//        2.1.2.2. Se não, o interruptor A controla a luz da sala 2 e o interruptor B controla a luz da sala 3
//
//  2.2. Se a sala estiver com a luz acesa, significa que é controlada pelo interruptor A ou B
//    2.2.1. Voltar para a sala dos interruptores, desligar o interruptor A
//    2.2.2. Ir para a sala 2
//          2.2.2.1. Se a luz estiver acesa, significa que B controla a luz da sala 2 e A controla a luz da sala 1 e C controla a luz da sala 3
//          2.2.2.2. Se não, significa que B controla a luz da sala 1 e A ou C controlam a luz da sala 2
//            2.2.2.2.1. Verificar temperatura ou resquício de luz na lâmpada da sala 2
//                2.2.2.1.1 Se houver resquício de luz ou temperatura elevada, a luz da sala 2 é controlada por A (que ficou acesa por mais tempo), e a luz da sala 3 é controlada por C
//                2.2.2.1.2 Se não, a luz da sala 2 é controlada por C e a luz da sala 3 é controlada por A
//
