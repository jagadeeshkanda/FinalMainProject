package Operations;

public interface ISelectOperation<T> {
	
	//Selects the option whose "value" attribute matches the specified string given by itemToSelect.
		public void selectItemByValue(T t, String itemToSelect);
		
		//Selects the option whose "text" attribute matches the specified string given by itemText.
		public void selectItemByText(T t, String itemText);
		
		//Selects the option whose "index" attribute matches the specified index given by itemIndex.
		public void selectItemByIndex(T t, int itemIndex);

}
