package org.example;

public class MyClass {

        private final Network clazz;

        MyClass(Network clazz) {
            this.clazz = clazz;
        }

        public boolean SendMessage() {
            return clazz.sendMessage("ip","msg");
        }
}
