package br.univille.logger;

class LoggerFactory {
    public Logger onConsole(){
        return new LoggerConsole();
    }
    public Logger onFile(){
        return new LoggerFile();
    }
}