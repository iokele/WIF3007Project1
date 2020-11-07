package com.mycompany.wif3007project1;

public class Animation {
    private EntranceBehaviour entranceBehaviour;
    private LoopingBehviour loopingBehviour;
    private ExitBehaviour exitBehaviour;
    public void performEntrance(){
        if (entranceBehaviour!= null){
            entranceBehaviour.entrance();
        }
    }
    public void performLooping(){
        if (loopingBehviour != null){
            loopingBehviour.loop();
        }
    }
    public void performExit(){
        if (exitBehaviour!=null){
            exitBehaviour.exit();
        }
    }
    public void setEntranceBehaviour(EntranceBehaviour entranceBehaviour) {
        this.entranceBehaviour = entranceBehaviour;
    }

    public void setLoopingBehviour(LoopingBehviour loopingBehviour) {
        this.loopingBehviour = loopingBehviour;
    }

    public void setExitBehaviour(ExitBehaviour exitBehaviour) {
        this.exitBehaviour = exitBehaviour;
    }
}
