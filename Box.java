public class Box 
{
	int height;
	int width;
	int depth;
	public void Box(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public void volume(int height,int weight,int depth)
	{
		System.out.println(height*weight*depth);
	}
	public static void main(String[] args) 
	{
		Box c=new Box();
		c.volume(20,10,50);
	}
}