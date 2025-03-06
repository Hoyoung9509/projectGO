package test;

public class TV implements remocon{

    private int currentChannel;

    @Override
    public void chUp() {
        currentChannel++;
        System.out.println(currentChannel+"번 채널입니다.");
    }

    @Override
    public void chDown() {
        if(currentChannel>1){
            currentChannel--;
            System.out.println(currentChannel+"번 채널 입니다.");
        } else {
            System.out.println("최소 채널은 1번입니다.");
        }
    }

    @Override
    public void volUp() {

    }

    @Override
    public void volDown() {

    }

    @Override
    public void intenet() {

    }
}
