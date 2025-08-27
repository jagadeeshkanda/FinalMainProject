package Operations;

public interface IFrameOperation<T> {
		//This method is used to switch to frame with given identifier.
		public void switchToFrame(final T identifier);
		
		//This method is used to switch to frame containing given text.
		public void switchToFrameContainingText(final String identifier);
		
		//This method is used to switch to frame by given index.
		public void switchToFrameByIndex(final int index);
		
		//This method is used to switch to default context
		public void switchToDefaultContext();
}
