/**
 * Copyright(c) 2015 DRAWNZER.ORG PROJECTS -> ANURAG
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *      
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *                             
 *                             anuraxsharma1512@gmail.com
 *
 */

package org.anurag.file.quest;

import java.util.ArrayList;

/**
 * 
 * @author anurag
 *
 */
public class QueuedTask {
	
	private int TASK_ID;
	private ArrayList<Item> ls;
	private int folders;
	private int files;
	private String id;
	private String task_Type;
	private boolean hasLockedItem;
	/**
	 * 
	 * @param item
	 * @param task_ID
	 */
	public QueuedTask(ArrayList<Item> item , int task_ID , int folder_c , int file_c
			,boolean locked) {
		// TODO Auto-generated constructor stub
		this.ls = item;
		this.TASK_ID = task_ID;
		this.folders = folder_c;
		this.files = file_c;
		this.hasLockedItem = locked;
		
		if(task_ID == 1)
			task_Type = "COPY";
		else if(task_ID == 2)
			task_Type = "CUT";
		else
			task_Type = "COMPRESS";
		
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Item> getList(){
		return this.ls;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTaskID(){
		return this.TASK_ID;
	}
	
	/**
	 * 
	 * @return
	 */
	public String folder_count(){
		return (folders + " folder ");
	}
	
	/**
	 * 
	 * @return
	 */
	public String file_count(){
		return (files + " file");
	}
	
	
	
	/**
	 * 
	 * @param ID to be set for current task
	 */
	public void setId(String ID){
		this.id = ID;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTaskType(){
		return this.task_Type;
	}
	
	/**
	 * 
	 * @return the id of current task
	 */
	public String getId(){
		return this.id;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasLockedItem(){
		return this.hasLockedItem;
	}
	
	/**
	 * 
	 * @return the first and second items name from the list
	 */
	public String getItemList(){
		String str = "";
		StringBuilder builder = new StringBuilder();
		int len = ls.size();
		for(int i = 0 ; i < len ; ++i){
			builder.append(ls.get(i).getName() + " , ");
		}
		str = builder.toString();
		if(str.endsWith(" , ")){
			str = str.substring(0, str.length()-3);
		}			
		return str;
	}
}
