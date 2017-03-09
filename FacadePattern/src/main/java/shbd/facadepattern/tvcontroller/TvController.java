package shbd.facadepattern.tvcontroller;

/**
 * 项目名称：DesignPattern
 * 类描述：
 * 创建人：yh
 * 创建时间：2017/3/9 17:06
 * 修改人：yh
 * 修改时间：2017/3/9 17:06
 * 修改备注：
 */
public class TvController {
    private ChannelSystem channelSystem = new ChannelSystem();
    private PowerSystem powerSystem = new PowerSystem();
    private VoiceSystem voiceSystem = new VoiceSystem();

    public void next() {
        channelSystem.next();
    }

    public void prev() {
        channelSystem.prev();

    }

    public void powerOn() {
        powerSystem.powerOn();
    }

    public void powerOff() {
        powerSystem.powerOff();
    }

    public void turnUp() {
        voiceSystem.turnUp();
    }

    public void turnDown() {
        voiceSystem.turnDown();
    }
}
