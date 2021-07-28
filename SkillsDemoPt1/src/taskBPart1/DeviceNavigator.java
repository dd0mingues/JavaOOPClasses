package taskBPart1;

//device navigator class to move through the devices array
public class DeviceNavigator {

	// class variables. this class will have two variables
	// the device array and index of the currently selected device
	private Device[] devices;
	private int currentDeviceIndex = 0;

	// device navigator constructor.
	public DeviceNavigator(Device[] devices) {
		this.devices = devices;
	}

	// methods
	// get the next device from the devices array
	public void getNextDevice() {
		// if the current device index is the max length of the array, it will jump to
		// index 0
		if (currentDeviceIndex == devices.length - 1) {
			currentDeviceIndex = 0;
		} else {
			currentDeviceIndex++;
		}
	}

	// get the previous device from the devices array
	public void getPreviousDevice() {
		// if the current device index is 0, it will jump to the last index of the array
		if (currentDeviceIndex == 0) {
			currentDeviceIndex = devices.length - 1;
		} else {
			currentDeviceIndex--;
		}
	}

	// get the last device from the devices array
	public void getLastDevice() {
		currentDeviceIndex = devices.length - 1;
	}

	// get the first device from the devices array
	public void getFirstDevice() {
		currentDeviceIndex = 0;
	}

	// get the count of devices in the devices array
	public int getDeviceCount() {
		return devices.length;
	}

	// get current device index
	public int getDeviceIndex() {
		return currentDeviceIndex;
	}

	// get current device
	public Device getCurrentDevice() {
		return devices[currentDeviceIndex];
	}

}
