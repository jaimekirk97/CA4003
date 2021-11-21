import java.util.*;

public class SymbolTable
{
	String marker = " ";
	HashMap<String,LinkedList<SymbolTableEntry>> map;
	Stack<String> stack;

	public SymbolTable() 
	{
		this.map = new HashMap<>();
		this.stack = new Stack<>();
		this.stack.push(marker);
	}

	public Object get(String id) 
	{
		if(map.containsKey(id))
		{
			LinkedList<SymbolTableEntry> linkLst = map.get(id);
			for (int i = 0; i < linkLst.size(); i++)
			{
				SymbolTableEntry entry = linkLst.get(i);
				if (entry.id.equals(id))
				{
					return entry;
				}
			}
		}
		return (Object) new SymbolTableEntry();
	}

	public void put(String id, String type, String scope)
	{
		SymbolTableEntry entry = new SymbolTableEntry(id, type, scope);

		stack.add(id);

		if(!map.containsKey(id)) 
		{
			LinkedList<SymbolTableEntry> linkLst = new LinkedList<>(Arrays.asList(entry));
			map.put(id, linkLst);
		}
		else 
		{
			LinkedList<SymbolTableEntry> linkLst = map.get(id);
			linkLst.addFirst(entry);
		}
	}

	public void openScope() {
        stack.add(marker);
    }

    public void closeScope() 
    {
        String symbol = stack.pop();
        
        while (!symbol.equals(marker)) 
        {
        	Integer key = symbol.hashCode();
        	LinkedList linkLst = map.get(key);
			for (int i = 0; i < linkLst.size(); i++)
			{
				SymbolTableEntry entry = (SymbolTableEntry)linkLst.get(i);
			}
        }
    }
    public void printStack() {
        System.out.println(Arrays.toString(this.stack.toArray()));
    }

    public void printMap() {
        System.out.println(map.toString());
    }
}