package br.liveo.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;
import br.liveo.viajabessa.R;

public class Utils {

	//Set all the navigation icons and always to set "zero 0" for the item is a category
	public static int[] iconNavigation = new int[] { 
		0, 0, 0, 0, 0, R.drawable.ic_action_settings, R.drawable.ic_action_about};	
	
	//get title of the item navigation
	public static String getTitleItem(Context context, int posicao){		
		String[] titulos = context.getResources().getStringArray(R.array.nav_menu_items);  
		return titulos[posicao];
	} 
	
	public static int[] colors = new int[] { 
		R.color.blue_dark, R.color.blue_dark, R.color.red_dark, R.color.red_light,
		R.color.green_dark, R.color.green_light, R.color.orange_dark, R.color.orange_light,
		R.color.purple_dark, R.color.purple_light};	
	
	public static void toastShort(Context context, int text){
		Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
	}
	
	public static void toastLong(Context context, int text){
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}	

	public static boolean isNetworkAvailabel(Context context) {

		ConnectivityManager connectivity = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);

		if (connectivity == null) {						
			return false;			
		} else {

			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null) {
				for (int i = 0; i < info.length; i++) {
					if (info[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
				}
			}
		}
		return false;
	}		
}
